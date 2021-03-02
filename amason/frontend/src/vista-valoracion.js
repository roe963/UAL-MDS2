import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-valoracion`
 *
 * VistaValoracion element.
 *
 * @customElement
 * @polymer
 */
class VistaValoracion extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-valoracion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValoracion.is, VistaValoracion);

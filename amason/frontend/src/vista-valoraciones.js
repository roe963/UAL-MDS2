import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-valoraciones`
 *
 * VistaValoraciones element.
 *
 * @customElement
 * @polymer
 */
class VistaValoraciones extends PolymerElement {

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
        return 'vista-valoraciones';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaValoraciones.is, VistaValoraciones);

import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-encargadocompras`
 *
 * VistaEncargadocompras element.
 *
 * @customElement
 * @polymer
 */
class VistaEncargadocompras extends PolymerElement {

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
        return 'vista-encargadocompras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadocompras.is, VistaEncargadocompras);

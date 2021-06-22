import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrarofertas`
 *
 * VistaAdministrarofertas element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarofertas extends PolymerElement {

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
        return 'vista-administrarofertas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarofertas.is, VistaAdministrarofertas);
